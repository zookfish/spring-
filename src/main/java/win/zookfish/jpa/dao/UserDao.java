package win.zookfish.jpa.dao;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import win.zookfish.jpa.entity.CountryEntity;

import java.util.List;

public interface UserDao extends JpaRepository<CountryEntity,Integer>{

    @Query("select c from CountryEntity c")
    public List<CountryEntity> findById(Pageable pageable);
}
