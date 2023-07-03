package com.example.elmboot.result;

import java.util.List;

/**
 * 列表结果，不分页
 */
public class ListResult<T> extends BaseResult {
    private List<T> data;

    public ListResult() {
    }

    public ListResult(List<T> data) {
        this.data = data;
    }

    public ListResult(String status, String message) {
        super(status, message);
    }

    public List<T> getData() {
        return this.data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ListResult)) {
            return false;
        } else {
            ListResult<?> other = (ListResult) o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$data = this.getData();
                Object other$data = other.getData();
                if (this$data == null) {
                    if (other$data != null) {
                        return false;
                    }
                } else if (!this$data.equals(other$data)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof ListResult;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $data = this.getData();
        result = result * 59 + ($data == null ? 43 : $data.hashCode());
        return result;
    }

    public String toString() {
        return "ListResult(data=" + this.getData() + ")";
    }
}
