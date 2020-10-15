package com.xuecheng.framework.domain.RePeat;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@ToString
@Table(name = "scenic_user")
@GenericGenerator(name = "jpa-assigned", strategy = "assigned")
public class USER {
    private static final long serialVersionUID = -906357150051689484L;
    @Id
    @GeneratedValue(generator = "jpa-assigned")
    @Column(length = 32)
    private String  id;






}
