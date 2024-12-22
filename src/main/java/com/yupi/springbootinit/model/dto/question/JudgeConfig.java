package com.yupi.springbootinit.model.dto.question;

import lombok.Data;

/**
 * @ClassName JudgeCase
 * @Description json串对应实体类，判题配置类
 * [
 *     {
 *         "timeLimit":"",
 *         "memoryLimit":"",
 *         "stackLImit":"",
 *     }
 * ]
 * @Author zhanglin
 */
@Data
public class JudgeConfig {

    /**
     * 时间限制(ms)
     */
    private Long timeLimit;

    /**
     * 内存限制(KB)
     */
    private Long menoryLimit;

    /**
     * 栈空间限制(KB)
     */
    private Long stackLimit;
}
