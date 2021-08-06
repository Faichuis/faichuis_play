package com.faichuis.faichuismall.common.converter;

import java.util.List;

public interface BaseDomainConverter<M,D> {

    /**
     * created by YinHao
     * 14:52 2020/11/23
     * Domain 转 DO
     *
     * @param domain 需要转换成DO的Domain
     * @return D
     */
    D toDO(M domain);

    /**
     * created by YinHao
     * 14:54 2020/11/23
     * DO 转 Domain
     *
     * @param dto 需要转换成Domain的DO
     * @return Domain
     */
    M toDomain(D dto);

    /**
     * created by YinHao
     * 14:56 2020/11/23
     * DomainList 转 DOList
     *
     * @param domainList domainList
     * @return java.util.List<D>
     */
    List<D> toDO(List<M> domainList);

    /**
     * created by YinHao
     * 14:57 2020/11/23
     * DOList 转 DomainList
     *
     * @param dtoList DOList
     * @return java.util.List<Domain>
     */
    List<M> toDomain(List<D> dtoList);
}
