package id.nontontivi.api.controller;

import id.nontontivi.api.entity.Berita;
import id.nontontivi.api.service.BeritaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BeritaController {

    @Autowired
    private BeritaService beritaService;

    @RequestMapping("/hello")
    public String hello()
    {
        return "Hello World!";
    }

    @RequestMapping("/allberita")
    public List<Berita> getAllBerita()
    {
        return beritaService.getAllBerita();
    }

    @RequestMapping("/headline/{jum}")
    public List<Berita> getNewBerita(@PathVariable int jum)
    {
        return beritaService.getBeritaByJum(jum);
    }

    @RequestMapping("berita/{id}")
    public Berita getBeritaDetail(@PathVariable long id)
    {
        return beritaService.getBeritaDetail(id);
    }
}
