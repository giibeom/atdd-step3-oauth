package nextstep.utils;

import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import nextstep.fixture.FieldFixture;

import java.util.List;

public class JsonPathUtil {

    public static Integer Integer로_추출(ExtractableResponse<Response> API_응답_결과, FieldFixture 추출할_데이터_필드) {
        return API_응답_결과.jsonPath().getInt(추출할_데이터_필드.필드명());
    }

    public static Long Long로_추출(ExtractableResponse<Response> API_응답_결과, FieldFixture 추출할_데이터_필드) {
        return API_응답_결과.jsonPath().getLong(추출할_데이터_필드.필드명());
    }

    public static String 문자열로_추출(ExtractableResponse<Response> API_응답_결과, FieldFixture 추출할_데이터_필드) {
        return API_응답_결과.jsonPath().getString(추출할_데이터_필드.필드명());
    }

    public static List<Object> List로_추출(ExtractableResponse<Response> API_응답_결과, FieldFixture 추출할_데이터_필드) {
        return API_응답_결과.jsonPath().getList(추출할_데이터_필드.필드명());
    }
}
