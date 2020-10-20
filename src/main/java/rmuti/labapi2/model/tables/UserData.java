package rmuti.labapi2.model.tables;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "user_data")
public class UserData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;

    @Column(name ="user_name")
    private  String userName;

    @Column(name = "pass_word")
    private  String passWord;


}
