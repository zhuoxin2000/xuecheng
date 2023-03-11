package com.zhuoxin.content.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhuoxin.base.model.PageParams;
import com.zhuoxin.base.model.PageResult;
import com.zhuoxin.base.model.dto.QueryCourseParamsDto;
import com.zhuoxin.content.mapper.CourseBaseMapper;
import com.zhuoxin.content.model.CourseBase;
import com.zhuoxin.content.service.CourseBaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseBaseInfoServiceImpl implements CourseBaseInfoService {

    @Autowired
    private CourseBaseMapper courseBaseMapper;

    @Override
    public PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto courseParamsDto) {
        LambdaQueryWrapper<CourseBase> queryWrapper = new LambdaQueryWrapper<>();
        //查询课程名称是否存在
        queryWrapper.like(StringUtils.isNotBlank(courseParamsDto.getCourseName()),CourseBase::getName,courseParamsDto.getCourseName());
        queryWrapper.eq(StringUtils.isNotBlank(courseParamsDto.getAuditStatus()),CourseBase::getAuditStatus,courseParamsDto.getAuditStatus());
        queryWrapper.eq(StringUtils.isNotBlank(courseParamsDto.getPublishStatus()),CourseBase::getStatus,courseParamsDto.getPublishStatus());

        //进行分页查询
        Page<CourseBase> page = new Page<>(pageParams.getPageNo(), pageParams.getPageSize());
        Page<CourseBase> pageResult = courseBaseMapper.selectPage(page, queryWrapper);
        List<CourseBase> courseBaseList = pageResult.getRecords();
        //分页查询出来的总条数
        long count = pageResult.getTotal();

        //构建结果集
        PageResult<CourseBase> courseBasePageResult = new PageResult<>(courseBaseList,count,pageParams.getPageNo(), pageParams.getPageSize());
        return courseBasePageResult;
    }
}
