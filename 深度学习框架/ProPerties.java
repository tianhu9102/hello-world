package cn.th.jump.demoboot.utils;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@Component
public class ProPerties {

    @Value("${com.didispace.blog.name}")
    private String name;

    @Value("${com.didispace.blog.title}")
    public String title;

    @Value("${com.didispace.blog.desc}")
    public String desc;

}
