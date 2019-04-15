package id.nontontivi.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import lombok.Data;

@Entity
@Data
public class Berita {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String url;
    private String judul;
    private String konten;
    private String source;
    private String tgl_berita;
    private Date timestamp;

    public Berita()
    {}
}
