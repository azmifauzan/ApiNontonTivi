package id.nontontivi.api.service;

import id.nontontivi.api.entity.Berita;
import id.nontontivi.api.repository.BeritaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BeritaService {
    @Autowired
    private BeritaRepository beritaRepository;

    public List<Berita> getAllBerita()
    {
        List<Berita> beritaList = new ArrayList<>();
        beritaRepository.findAll().forEach(beritaList::add);
        return beritaList;
    }

    public List<Berita> getBeritaByJum(int jum)
    {
        Page<Berita> berita = beritaRepository.findAllByOrderByIdDesc(PageRequest.of(0, jum));
        return berita.getContent();
    }
}
