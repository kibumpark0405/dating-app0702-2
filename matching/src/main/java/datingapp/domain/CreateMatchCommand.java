package datingapp.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Data
public class CreateMatchCommand {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private String matchId;
        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private String userId;
        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private List&lt;String&gt; interests;


}
