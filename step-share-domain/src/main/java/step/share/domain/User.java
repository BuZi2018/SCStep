package step.share.domain;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Component
@Entity
@Table(name = "t_user")
public class User {
    @GeneratedValue
    @Id
    public Integer userId;

    public String userName;

    public String userNote;
}
