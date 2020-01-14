package com.gcamargo.feignDemo.config.client;

import com.gcamargo.feignDemo.exception.BadRequestException;
import com.gcamargo.feignDemo.exception.InternalErrorException;
import com.gcamargo.feignDemo.exception.NotFoundException;
import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String methodKey, Response response) {

        switch (response.status()){
            case 400:
                return new BadRequestException("Erro ao realizar chamada!");
            case 404:
                return new NotFoundException("Recurso não encontrado!");
            default:
                return new InternalErrorException("Erro ao realizar chamada!");
        }
    }
}