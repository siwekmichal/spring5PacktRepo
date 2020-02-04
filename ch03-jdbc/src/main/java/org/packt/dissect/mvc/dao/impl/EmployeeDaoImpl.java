package org.packt.dissect.mvc.dao.impl;

import org.packt.dissect.mvc.dao.EmployeeDao;
import org.packt.dissect.mvc.model.data.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private SimpleJdbcInsert jdbcInsert;


    @Override
    public List<Employee> getEmployees() {
        String sql = "SELECT * FROM hrs.employee " ;
        List<Employee> emps = jdbcInsert.getJdbcTemplate().query(sql, new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int i) throws SQLException {
                Employee emp = new Employee();

                emp.setId(rs.getInt("id"));
                emp.setEmpId(rs.getInt("empId"));
                emp.setFirstName(rs.getString("firstName"));
                emp.setLastName(rs.getString("lastName"));
                emp.setBirthday(rs.getDate("birthday"));
                emp.setAge(rs.getInt("age"));
                emp.setEmail(rs.getString("email"));
                emp.setDeptId(rs.getInt("deptId"));
                return  emp;
            }
        });

        return emps;
    }

    @Override
    public List<Employee> getEmployeeDept(Integer deptId) {
        String sql = "SELECT * FROM hrs.employee WHERE deptId = ?";
        List<Employee> emps = jdbcInsert.getJdbcTemplate().
                query(sql, new Object[] {deptId} , new RowMapper<Employee>() {
                    @Override
                    public Employee mapRow(ResultSet rs, int i) throws SQLException {
                        Employee emp = new Employee();
                        emp.setId(rs.getInt("id"));
                        emp.setEmpId(rs.getInt("empId"));
                        emp.setFirstName(rs.getString("firstName"));
                        emp.setLastName(rs.getString("lastName"));
                        emp.setBirthday(rs.getDate("birthday"));
                        emp.setAge(rs.getInt("age"));
                        emp.setEmail(rs.getString("email"));
                        emp.setDeptId(rs.getInt("deptId"));
                        return  emp;

                    }
                });
        return emps ;
    }

    @Override
    public Employee getEmployee(Integer id) {
        String sql =  "SELECT * FROM hrs.employee WHERE id = ?";
        return jdbcInsert.getJdbcTemplate().queryForObject(sql, new RowMapper<Employee>(){

            @Override
            public Employee mapRow(ResultSet rs, int i) throws SQLException {
                Employee emp = new Employee();
                emp.setId(rs.getInt("id"));
                emp.setEmpId(rs.getInt("empId"));
                emp.setFirstName(rs.getString("firstName"));
                emp.setLastName(rs.getString("lastName"));
                emp.setBirthday(rs.getDate("birthday"));
                emp.setAge(rs.getInt("age"));
                emp.setEmail(rs.getString("email"));
                emp.setDeptId(rs.getInt("deptId"));
                return  emp;
            }
        }, id);

    }


    @Override
    public void addEmployeeBySJI(Employee emp) {
        Map<String, Object> parameters = new HashMap<String, Object>();
        jdbcInsert.withTableName("hrs.employee");
        jdbcInsert.usingGeneratedKeyColumns("id");

        parameters.put("id", emp.getId());
        parameters.put("empId", emp.getEmpId());
        parameters.put("firstName", emp.getFirstName());
        parameters.put("lastName", emp.getLastName());
        parameters.put("birthday", emp.getBirthday());
        parameters.put("age", emp.getAge());
        parameters.put("email", emp.getEmail());
        parameters.put("deptId", emp.getDeptId());

        jdbcInsert.execute(parameters);

    }

    @Override
    public void addEmployeeByJT(Employee emp) {
        String sql = "INSERT INTO hrs.employee (empId, firstName, lastName, age, birthday, email, deptId) " +
                "VALUES (?,?,?,?,?,?,?) ";
        jdbcInsert.getJdbcTemplate().update( sql, emp.getEmpId(), emp.getFirstName(),
                emp.getLastName(), emp.getAge(), emp.getBirthday(), emp.getEmail(), emp.getDeptId());
    }

    @Override
    public void updateEmployee(Employee emp) {
        String sql = "UPDATE hrs.employee SET empId = ?, firstName = ?, lastName = ?, age = ?, birthday = ?, email = ?, deptId = ? " +
                "WHERE id = ?";
        jdbcInsert.getJdbcTemplate().update( sql, emp.getEmpId(), emp.getFirstName(),
                emp.getLastName(), emp.getAge(), emp.getBirthday(), emp.getEmail(), emp.getDeptId(), emp.getId());

    }

    @Override
    public void deleteEmployee(Integer empId) {
        String sql = "DELETE FROM hrs.employee WHERE id = ? ";
        jdbcInsert.getJdbcTemplate().update(sql,empId);
    }
}
