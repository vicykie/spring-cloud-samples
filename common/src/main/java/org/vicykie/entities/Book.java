package org.vicykie.entities;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by 李朝衡 on 2016/8/22.
 */
@Data
public class Book implements Serializable {
    private long id;
    private String name,publisher,author;
}
