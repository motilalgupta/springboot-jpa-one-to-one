package org.cfs.jpa02.repo;

import org.cfs.jpa02.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepo extends JpaRepository<Laptop,Long> {
}
