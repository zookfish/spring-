package win.zookfish.jpa.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import win.zookfish.jpa.dao.UserDao;
import win.zookfish.jpa.entity.CountryEntity;

import java.util.List;

@Service
public class DemoService {

    @Autowired
    private UserDao userDao;

    public List<CountryEntity> getBy() {


        List<CountryEntity> lists = userDao.findById(new PageRequest(0,20));
        return  lists;
    }

}
