package snipurl.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UrlResponseDto {
    private String originalUrl;
    private String shortLink;
    private LocalDateTime expirationDate;
}