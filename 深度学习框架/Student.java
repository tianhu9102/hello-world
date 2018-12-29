package cn.th.jump.demoboot.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Student {
    private Long id;
    private String name;
    private Integer age;
    private String nation;
}
