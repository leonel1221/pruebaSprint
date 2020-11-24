package com.example.demo.service;

import com.example.demo.modelo.client;
import com.example.demo.repositiry.clientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class clientService implements clientRepository{
    @Autowired
    private com.example.demo.repositiry.clientRepository clientRepository;

    @Override
    public List<client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public List<client> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<client> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<client> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {
       clientRepository.deleteById(aLong);
    }

    @Override
    public void delete(client client) {
      clientRepository.delete(client);
    }

    @Override
    public void deleteAll(Iterable<? extends client> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends client> S save(S s) {
        return clientRepository.save(s);
    }

    @Override
    public <S extends client> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<client> findById(Long aLong) {
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
    public <S extends client> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<client> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public client getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends client> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends client> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends client> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends client> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends client> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends client> boolean exists(Example<S> example) {
        return false;
    }
}
