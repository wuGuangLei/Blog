package cn.noahcode.blog.model.dto;

import lombok.Data;

/**
 * @author NoahCode
 * @date 2020/9/30
 * @description
 */
@Data
public class TagWithPostCountDTO extends TagDTO {

    private Long postCount;

}
