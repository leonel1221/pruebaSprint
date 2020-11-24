package com.example.demo.service;

import com.example.demo.modelo.producer;
import com.example.demo.repositiry.producerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class producerService implements producerRepository {
    @Autowired
    private producerRepository producerRepository;

    @Override
    public List<producer> findAll() {
        return producerRepository.findAll();
    }

    @Override
    public List<producer> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<producer> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<producer> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {
     producerRepository.deleteById(aLong);
    }

    @Override
    public void delete(producer producer) {
      producerRepository.delete(producer);
    }

    @Override
    public void deleteAll(Iterable<? extends producer> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends producer> S save(S s) {
        return producerRepository.save(s);
    }

    @Override
    public <S extends producer> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<producer> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends producer> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<producer> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public producer getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends producer> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends producer> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends producer> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends producer> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends producer> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends producer> boolean exists(Example<S> example) {
        return false;
    }
}
