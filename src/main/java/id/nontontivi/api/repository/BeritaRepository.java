package id.nontontivi.api.repository;

import id.nontontivi.api.entity.Berita;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface BeritaRepository extends CrudRepository<Berita,Long> {
    Page<Berita> findAllByOrderByIdDesc(Pageable pageable);
}
