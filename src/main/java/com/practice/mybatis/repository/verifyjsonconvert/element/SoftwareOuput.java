package com.practice.mybatis.repository.verifyjsonconvert.element;

import lombok.*;

/**
 * @author Luo Bao Ding
 * @since 2019/12/11
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SoftwareOuput {
    private String softwareName;
    private Integer userCount;
}
