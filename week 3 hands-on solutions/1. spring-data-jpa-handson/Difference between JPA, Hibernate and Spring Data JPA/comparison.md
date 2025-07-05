# Comparison between JPA, Hibernate, and Spring Data JPA

| Feature                   | JPA                         | Hibernate                         | Spring Data JPA                             |
|--------------------------|-----------------------------|-----------------------------------|---------------------------------------------|
| Type                     | Specification               | Implementation                    | Abstraction Framework                       |
| Boilerplate              | Moderate                    | Moderate                          | Minimal                                     |
| Implementation Required  | Yes                         | No (It's an implementation)       | Uses underlying JPA (e.g., Hibernate)       |
| Transaction Management   | Manual                      | Manual                            | Automatic via Spring Framework              |
| Ease of Use              | Moderate                    | Moderate                          | High                                        |

## Hibernate Example
```java
public Integer addEmployee(Employee employee){
   Session session = factory.openSession();
   Transaction tx = null;
   Integer employeeID = null;
   try {
      tx = session.beginTransaction();
      employeeID = (Integer) session.save(employee); 
      tx.commit();
   } catch (HibernateException e) {
      if (tx != null) tx.rollback();
      e.printStackTrace(); 
   } finally {
      session.close(); 
   }
   return employeeID;
}
```

## Spring Data JPA Example
```java
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {}

@Autowired
private EmployeeRepository employeeRepository;

@Transactional
public void addEmployee(Employee employee) {
    employeeRepository.save(employee);
}
```
