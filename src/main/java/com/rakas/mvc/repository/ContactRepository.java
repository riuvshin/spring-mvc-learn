package com.rakas.mvc.repository;

import com.rakas.mvc.domain.Contact;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author <a href="mailto:riuvshin@codenvy.com">Roman Iuvshin</a>
 * @version $Id: 5:40 PM 8/25/13 $
 */
public interface ContactRepository extends PagingAndSortingRepository<Contact, Long> {
}
