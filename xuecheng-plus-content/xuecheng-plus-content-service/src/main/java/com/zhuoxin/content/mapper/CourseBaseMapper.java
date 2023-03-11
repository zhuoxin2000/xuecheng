package com.zhuoxin.content.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhuoxin.base.model.PageParams;
import com.zhuoxin.base.model.dto.QueryCourseParamsDto;
import com.zhuoxin.content.model.CourseBase;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 课程基本信息 Mapper 接口
 * </p>
 *
 * @author itcast
 */
@Mapper
public interface CourseBaseMapper extends BaseMapper<CourseBase> {

//    /**
//     * 查询课程信息
//     */
//    public CourseBase queryCourseBaseList(@Param("pageParams") PageParams pageParams,
//                                          @Param("queryCourseParamsDto") QueryCourseParamsDto queryCourseParamsDto);
}
