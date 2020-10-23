package com.xuecheng.framework.model.response;

/**
 * @Author admin
 * @description
 * @ 2020/10/23
 */
public class CommonResult<T> implements ResultCode{
    private  T data;
    private  Boolean success;
    private  int code;
    private  String message;
    @Override
    public boolean success() {
        return false;
    }

    @Override
    public int code() {
        return 0;
    }

    @Override
    public String message() {
        return null;
    }
    protected CommonResult(ResultCode resultCode, T data) {
        super();
        this.success = resultCode.success();
        this.code = resultCode.code();
        this.message = resultCode.message();
        this.data = data;
    }
    protected CommonResult(ResultCode resultCode) {
        super();
        this.success = resultCode.success();
        this.code = resultCode.code();
        this.message = resultCode.message();
    }
    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<T>(CommonCode.SUCCESS, data);
    }
    public static <T> CommonResult<T> failed(T data) {
        return new CommonResult<T>(CommonCode.FAIL, data);
    }
    public static <T> CommonResult<T> Unauth(T data) {
        return new CommonResult<T>(CommonCode.UNAUTHORISE, data);
    }
    public static <T> CommonResult<T> failed() {
        return new CommonResult<T>(CommonCode.FAIL);
    }

    public static <T> CommonResult<T> validateFailed() {
        return new CommonResult<T>(CommonCode.VALIDATEPARAMERROR);
    }


}
