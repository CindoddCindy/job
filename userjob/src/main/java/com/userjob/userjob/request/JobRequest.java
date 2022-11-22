package com.userjob.userjob.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class JobRequest {
  private String type;

  private String url;

  private Date created_at;

  private String company;

  private String company_url;

  private String location;

  private String title;

  private String description;

  private String how_to_apply;

  private String company_logo;
}
