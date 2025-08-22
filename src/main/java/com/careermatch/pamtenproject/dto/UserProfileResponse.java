package com.careermatch.pamtenproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserProfileResponse {
    private String userId;
    private String email;
    private String fullName;
    private String phone;
    private String roleName;
    private Boolean profileCompleted;
    private Boolean isActive;
}