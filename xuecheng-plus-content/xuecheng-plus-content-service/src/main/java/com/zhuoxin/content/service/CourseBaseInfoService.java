package com.zhuoxin.content.service;

import com.zhuoxin.base.model.PageParams;
import com.zhuoxin.base.model.PageResult;
import com.zhuoxin.base.model.dto.QueryCourseParamsDto;
import com.zhuoxin.content.model.CourseBase;

/**
 * @description 课程基本信息管理业务接口
 */
public interface CourseBaseInfoService {

    /**
     * @description 课程查询接口
     * @param pageParams 分页参数
     * @param queryCourseParamsDto 条件条件
     * @return com.zhuoxin.base.model.PageResult<com.zhuoxin.content.model.po.CourseBase>
     */
    public PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);
}
