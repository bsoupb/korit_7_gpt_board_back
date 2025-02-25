package com.korit.boardback.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "사용자 로그인 DTO")
public class ReqLoginDto {
    @Schema(description = "사용자이름", example = "test1234")
    private String username;

    @Schema(description = "비밀번호", example = "q1w2e3r4!")
    private String password;
}
