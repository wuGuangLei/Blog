package cn.noahcode.blog.model.dto;

import cn.noahcode.blog.model.entity.Tag;
import lombok.Data;

import java.util.List;

/**
 * @author NoahCode
 * @date 2020/9/30
 * @description
 */
@Data
public class TagDTO {

    private List<Tag> tags;

}
