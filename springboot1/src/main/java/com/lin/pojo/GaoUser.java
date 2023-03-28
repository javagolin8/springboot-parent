package com.lin.pojo;


import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("gaouser")
public class GaoUser {


 private    Long	id;
    private    String	name;
    private   Integer	age;
    private   String	email;
    private   Long	manager_id;
    @TableField(value = "create_time", fill =FieldFill.INSERT)

    private LocalDateTime createTime;
    @TableField(value = "update_time",fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
    private    Integer	version;
    private   Integer	deleted;


   public static void main(String[] args) {


      String a=5+"5";
      String a1=5+5+"5"+5+5;
      String a2='5'+5+"zzt";
      String a3='5'+5+"zzt";
      String a4="zzt"+'5'+5;
      String a5="5"+5;
      System.out.println(a);
      System.out.println(a1);
      System.out.println(a2);
      System.out.println(a3);
      System.out.println(a4);
      System.out.println(a5);



         }


}
