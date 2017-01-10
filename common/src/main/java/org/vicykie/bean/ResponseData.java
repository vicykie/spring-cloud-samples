package org.vicykie.bean;

import lombok.Data;

/**
 * Created by 李朝衡 on 2016/12/9.
 */
@Data
public class ResponseData<T> {
    private T data;
    private boolean success;
    private String rspMsg;
}
