package zhuboss.gateway.service.param;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class UpdateUserParam extends SaveUserParam {
    @NotNull
    private Integer id;
}
