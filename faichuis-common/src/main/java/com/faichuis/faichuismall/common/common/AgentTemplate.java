package com.faichuis.faichuismall.common.common;


import org.springframework.stereotype.Component;

@Component
public class AgentTemplate {

    public <Req extends BaseRequest,Res,AcsReq extends AcsRequest,AcsRes extends  AcsResponse> Res executeAcs(Req request,AcsReq ascRequest,AcsRes acsResponse,
                                                                                                              AcsBuildInvoker<Req,AcsReq> buildInvocker,
                                                                                                              AcsCheckInvoker<AcsRes> checkInvoker,
                                                                                                              AcsParseInvoker<Res,AcsRes> parseInvoker){


        return parseInvoker.parseResponse(acsResponse);
    }

    public <Req extends BaseRequest,Res> Res executeCommon(Req requerst,String url,CommonBuildInvoker<Req> buildInvoker,CommonParseInvoker<Res> parseInvoker) {

        CommonResponse response = new CommonResponse();
        return  parseInvoker.parseResponse(response);
    }


    public interface CommonBuildInvoker<Req extends BaseRequest>{
        void buildRequest(Req input,CommonRequest request);
    }

    public interface CommonParseInvoker<Res>{

        Res parseResponse(CommonResponse response);
    }

    public interface AcsBuildInvoker<Req extends BaseRequest,AcsReq extends AcsRequest>{
        void buildRequest(Req request,AcsReq acsRequest);
    }

    public interface  AcsCheckInvoker<AcsRes extends AcsResponse>{
        Boolean checkResponse(AcsRes response);
    }

    public interface  AcsParseInvoker<Res,AcsRes extends  AcsResponse>{
        Res parseResponse(AcsRes response);
    }
}
