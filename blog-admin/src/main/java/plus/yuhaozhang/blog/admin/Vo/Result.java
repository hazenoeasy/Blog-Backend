package plus.yuhaozhang.blog.admin.Vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Yuh Z
 * @date 12/17/21
 */
@Data
@AllArgsConstructor
public class Result {
    private boolean success;
    private Integer code;
    private String message;
    private Object data;
    public static Result success(Object data){
        return new Result(true,200,"success",data);
    }
    public static Result fail(int code, String message){
        return new Result(false,code,message,null);
    }
}
