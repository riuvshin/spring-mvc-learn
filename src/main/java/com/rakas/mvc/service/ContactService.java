package com.rakas.mvc.service;

import com.rakas.mvc.domain.Contact;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author <a href="mailto:riuvshin@codenvy.com">Roman Iuvshin</a>
 * @version $Id: 5:38 PM 8/25/13 $
 */
public interface ContactService {

    public List<Contact> findAll();

    public Contact findById(Long id);

    public Contact save(Contact contact);

    public Page<Contact> findAllByPage(Pageable pageable);
}
