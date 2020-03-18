import { BaseAPI } from "@swaggerBase";
import { HostnameResolver } from "../service/HostnameResolver";
import { useApiDispatch } from "../api/ApiContext";
import { endLoading, startLoading } from "../api/ApiContextActions";
import { apiCallHandler } from "../api/defaults";

export function useApi<T extends BaseAPI>(api: new (...args: any[]) => T) {
  const dispatch = useApiDispatch();

  async function handleApiCall(...args: Parameters<typeof apiCallHandler>) {
    try {
      dispatch(startLoading());
      return apiCallHandler(...args);
    } finally {
      dispatch(endLoading());
    }
  }

  return new api(handleApiCall, HostnameResolver.getApiUrl());
}