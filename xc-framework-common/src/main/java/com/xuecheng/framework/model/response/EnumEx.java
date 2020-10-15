package com.xuecheng.framework.model.response;

public enum EnumEx  implements  ResultCode{
    SUCCESS(true,10010,"成功"),
    FAIL(false,00000,"失败"),
    UNENOUGHPERMISSION(false,01001,"权限不足,无法访问"),

    ;


    Boolean Success;
    Integer Rescode;
    String  Message;
    EnumEx (Boolean success, Integer rescode,String message){
        this.Success =success;
        this.Rescode =rescode;
        this.Message =message;
    }

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
}
