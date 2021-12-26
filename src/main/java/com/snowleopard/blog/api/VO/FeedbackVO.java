package com.snowleopard.blog.api.VO;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description:
 * Param:
 * return:
 * Author: 20191002864 周颖雯
 * Date: 2021/12/26
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FeedbackVO {
    @ApiModelProperty("feedback")
    private String feedback;
}
