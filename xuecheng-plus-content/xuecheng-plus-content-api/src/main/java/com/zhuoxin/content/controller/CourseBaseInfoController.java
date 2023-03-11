package com.zhuoxin.content.controller;


import com.zhuoxin.base.model.PageParams;
import com.zhuoxin.base.model.PageResult;
import com.zhuoxin.base.model.dto.QueryCourseParamsDto;
import com.zhuoxin.content.model.CourseBase;
import com.zhuoxin.content.service.CourseBaseInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description 课程信息编辑接口
 */
@Api(value = "课程信息编辑接口",tags = "课程信息编辑接口")
@RestController
public class CourseBaseInfoController {
    @Autowired
    private CourseBaseInfoService courseBaseInfoService;

    @ApiOperation("课程查询接口")
    @PostMapping("/course/list")
    public PageResult<CourseBase> list(PageParams pageParams, @RequestBody QueryCourseParamsDto queryCourseParams){
        return  courseBaseInfoService.queryCourseBaseList(pageParams, queryCourseParams);
    }
}
