package com.example.procospring.service;

import com.example.procospring.user.YourEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YourService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<YourEntity> search(String country, String grade, String language, String period, Boolean dormitory) {
        // SQL 쿼리를 동적으로 생성하기 위한 StringBuilder
        StringBuilder query = new StringBuilder("SELECT * FROM your_table WHERE 1=1");

        // 각 조건에 맞게 쿼리를 동적으로 추가
        if (country != null) {
            query.append(" AND dispatchcountryfore = '").append(country.replace("'", "''")).append("'");
        }
        if (language != null) {
            query.append(" AND languaespoken = '").append(language.replace("'", "''")).append("'");
        }
        if (grade != null) {
            query.append(" AND mincredit >= CAST(").append(grade).append(" AS DECIMAL)");
        }

        if (period != null) query.append(" AND period = '").append(period).append("'");
        if (dormitory != null) query.append(" AND dormitory = ").append(dormitory ? 1 : 0);

        // 쿼리 실행
        return jdbcTemplate.query(query.toString(), new BeanPropertyRowMapper<>(YourEntity.class));
    }
}
