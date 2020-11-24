package com.example.demo.service;

import com.example.demo.modelo.buy;
import com.example.demo.repositiry.buyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class buyService implements buyRepository{
    @Autowired
    private com.example.demo.repositiry.buyRepository buyRepository;

    @Override
    public List<buy> findAll() {
        return buyRepository.findAll();
    }

    @Override
    public List<buy> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<buy> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<buy> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {
       buyRepository.deleteById(aLong);
    }

    @Override
    public void delete(buy buy) {
      buyRepository.delete(buy);
    }

    @Override
    public void deleteAll(Iterable<? extends buy> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends buy> S save(S s) {
        return null;
    }

    @Override
    public <S extends buy> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<buy> findById(Long aLong) {
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
    public <S extends buy> S saveAndFlush(S s) {
        return buyRepository.save(s);
    }

    @Override
    public void deleteInBatch(Iterable<buy> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public buy getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends buy> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends buy> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends buy> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends buy> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends buy> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends buy> boolean exists(Example<S> example) {
        return false;
    }
}
