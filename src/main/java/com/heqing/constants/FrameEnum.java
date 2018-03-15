package com.heqing.constants;

import com.heqing.entity.task.FieldEntity;
import com.heqing.entity.task.TaskEntity;
import com.heqing.util.ObjectUtil;

import java.util.Map;
import java.util.Set;

/**
 * 生成代码中所包含的框架
 *
 * @author heqing
 * @email 975656343@qq.com
 * @date 2018/03/12
 */
public enum FrameEnum {

    /*
     * jar jar项目
     */
    JAR("jar"),
    /*
     * maven maven项目
     */
    MAVEN("maven"),
    /*
     * spring Spring框架
     */
    SPRING("spring"),
    /*
     * springboot springboot框架
     */
    SPRINGBOOT("springboot"),
    /*
     * hibernate hibernate框架
     */
    HIBERNATE("hibernate"),
    /*
     * mybatis mybatis框架
     */
    MYBATIS("mybatis"),
    /*
     * springmvc springmvc框架
     */
    SPRINGMVC("springmvc"),
    /*
     * strtus2 strtus2框架
     */
    STRUTS2("struts2");

    private final String frame;

    private FrameEnum(String frame) {
        this.frame = frame;
    }

    public static void addTemplates(TaskEntity taskEntity) {
        FrameEnum serviceFrame = taskEntity.getFrame().getServiceFrame();
        switch (serviceFrame) {
            case SPRING:
                taskEntity.getTemplates().add(TemplatesEnum.SPRING_CONFIG);
                taskEntity.getTemplates().add(TemplatesEnum.MYBATIS_CONFIG);
                break;
            case SPRINGBOOT:
                taskEntity.getTemplates().add(TemplatesEnum.APPLICATION);
                taskEntity.getTemplates().add(TemplatesEnum.APPLICATION_PROPERTIES);
                break;
            default:;
        }

        FrameEnum repositoryFrame = taskEntity.getFrame().getRepositoryFrame();
        switch (repositoryFrame) {
            case MYBATIS:
                taskEntity.getTemplates().add(TemplatesEnum.MYBATIS_ENTITY);
                taskEntity.getTemplates().add(TemplatesEnum.MYBATIS_DAO);
                taskEntity.getTemplates().add(TemplatesEnum.MYBATIS_MAPPER);
                taskEntity.getTemplates().add(TemplatesEnum.MYBATIS_SERVICE);
                taskEntity.getTemplates().add(TemplatesEnum.MYBATIS_SERVICEIMPL);
                taskEntity.getTemplates().add(TemplatesEnum.MYBATIS_TEST);
                break;
            case HIBERNATE:
                taskEntity.getTemplates().add(TemplatesEnum.HIBERNATE_ENTITY);
                taskEntity.getTemplates().add(TemplatesEnum.HIBERNATE_DAO);
                taskEntity.getTemplates().add(TemplatesEnum.HIBERNATE_SERVICE);
                taskEntity.getTemplates().add(TemplatesEnum.HIBERNATE_SERVICEIMPL);
                taskEntity.getTemplates().add(TemplatesEnum.HIBERNATE_TEST);
                taskEntity.getTemplates().add(TemplatesEnum.UTIL_PAGEINFO);
                break;
            default:;
        }
    }

    public static void addEntityPKTemplates(TaskEntity taskEntity, Set<Map<String, Object>> keyFields) {
        FrameEnum repositoryFrame = taskEntity.getFrame().getRepositoryFrame();
        if(repositoryFrame == HIBERNATE) {
            taskEntity.getTemplates().remove(TemplatesEnum.HIBERNATE_ENTITY_PK);
            if(keyFields.size() == 0) {
                FieldEntity field = new FieldEntity();
                field.setColumnName("id");
                field.setFiledName("Id");
                field.setEntityName("id");
                field.setType("Integer");
                field.setComment("主键");
                Map<String, Object> keyField = ObjectUtil.objToMap(field);
                keyField.put("isAutoAdd", "");
                keyFields.add(keyField);
            }else if(keyFields.size() > 1) {
                taskEntity.getTemplates().add(TemplatesEnum.HIBERNATE_ENTITY_PK);
            }
        }
    }

}