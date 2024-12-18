package com.yupi.springbootinit.model.dto.questionsubmit;

/**
 * @ClassName JudgeInfo
 * @Description json串对应实体类，判题结果信息
 * [
 *     {
 *         "message":"程序执行信息",
 *         "time":"",
 *         "memory":"",
 *     }
 * ]
 * @Author zhanglin
 */
public class JudgeInfo {

    /**
     * 程序执行信息
     */
    private String timeLimit;

    /**
     * 用时
     */
    private Long time;

    /**
     * 内存大小
     */
    private Long memory;
}
