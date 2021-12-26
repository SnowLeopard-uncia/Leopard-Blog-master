package com.snowleopard.blog.param;

import com.sun.istack.internal.NotNull;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * Description:
 * Param:
 * return:
 * Author: 20191002864 周颖雯
 * Date: 2021/12/25
 */
@Data
public class BlogsInsertParam implements Serializable {
    @ApiModelProperty("title")
    @NotNull
    private String blogsTitle;

    @ApiModelProperty("description")
    @NotNull
    private String blogsDescription;

    @ApiModelProperty("isPost")
    @NotNull
    private Long isPost;

    @ApiModelProperty("draft")
    @NotNull
    private Long draft;

}
