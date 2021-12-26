package com.snowleopard.blog.api.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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
public class ListVO<T> {
    private List<T> list;
}
