package com.yupi.springbootinit.model.dto.question;

import lombok.Data;

/**
 * @ClassName JudgeCase
 * @Description json串对应的实体类，判题用例
 * [
 *     {
 *         "input":"1 2",
 *         "output":"3 4",
 *     }
 * ]
 * @Author zhanglin
 */
@Data
public class JudgeCase {
    /**
     * 输入用例
     */
    private String input;

    /**
     * 输出用例
     */
    private String output;
}
