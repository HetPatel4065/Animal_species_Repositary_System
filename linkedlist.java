class linkList_animal {
    class node {
        insert_animal data;
        node next;

        public node(insert_animal data) {
            this.data = data;
            this.next = null;
        }
    }

    node first = null;

    void Add(insert_animal data) {
        node n = new node(data);
        if (first == null) {
            first = n;
        } else {
            node temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
            n.next = null;
        }
    }

    void DELETE(int data) {
        if (first == null) {
            return;
        } else {
            node temp = first;
            while (temp != null) {
                if (temp.next.data.getId() == data) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }
        }
    }

    void display() {
        if (first == null) {
            return;
        } else {
            node temp = first;
            while (temp != null) {
                temp=temp.next;
            }
            System.out.println("*****************************************");
        }
    }
}

class linkList_animal_details {
    class node {
        insert_animal_detail data;
        node next;

        public node(insert_animal_detail data) {
            this.data = data;
            this.next = null;
        }
    }

    node first = null;

    void Add(insert_animal_detail data) {
        node n = new node(data);
        if (first == null) {
            first = n;
        } else {
            node temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
            n.next = null;
        }
    }

    void DELETE(int data) {
        if (first == null) {
            return;
        } else {
            node temp = first;
            while (temp != null) {
                if (temp.next.data.getAid() == data) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }
        }
    }

    void display() {
        if (first == null) {
            return;
        } else {
            node temp = first;
            while (temp != null) {
                temp=temp.next;
            }
            System.out.println("*****************************************");
        }
    }
}

class linkList_category {
    class node {
        insert_category data;
        node next;

        public node(insert_category data) {
            this.data = data;
            this.next = null;
        }
    }

    node first = null;

    void Add(insert_category data) {
        node n = new node(data);
        if (first == null) {
            first = n;
        } else {
            node temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
            n.next = null;
        }
    }

    void DELETE(int data) {
        if (first == null) {
            return;
        } else {
            node temp = first;
            while (temp != null) {
                if (temp.next.data.getCatid() == data) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }
        }
    }

    void display() {
        if (first == null) {
            return;
        } else {
            node temp = first;
            while (temp != null) {
                temp=temp.next;
            }
            System.out.println("*****************************************");
        }
    }
}

class linkList_city {
    class node {
        insert_city data;
        node next;

        public node(insert_city data) {
            this.data = data;
            this.next = null;
        }
    }

    node first = null;

    void Add(insert_city data) {
        node n = new node(data);
        if (first == null) {
            first = n;
        } else {
            node temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
            n.next = null;
        }
    }

    void DELETE(int data) {
        if (first == null) {
            return;
        } else {
            node temp = first;
            while (temp != null) {
                if (temp.next.data.getCityid() == data) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }
        }
    }

    void display() {
        if (first == null) {
            return;
        } else {
            node temp = first;
            while (temp != null) {
                temp=temp.next;
            }
            System.out.println("*****************************************");
        }
    }
}

class linkList_state {
    class node {
        insert_state data;
        node next;

        public node(insert_state data) {
            this.data = data;
            this.next = null;
        }
    }

    node first = null;

    void Add(insert_state data) {
        node n = new node(data);
        if (first == null) {
            first = n;
        } else {
            node temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
            n.next = null;
        }
    }

    void DELETE(int data) {
        if (first == null) {
            return;
        } else {
            node temp = first;
            while (temp != null) {
                if (temp.next.data.getState_id() == data) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }
        }
    }

    void display() {
        if (first == null) {
            return;
        } else {
            node temp = first;
            while (temp != null) {
                temp=temp.next;
            }
            System.out.println("*****************************************");
        }
    }
}

class linkList_subcategory {
    class node {
        insert_subcategory data;
        node next;

        public node(insert_subcategory data) {
            this.data = data;
            this.next = null;
        }
    }

    node first = null;

    void Add(insert_subcategory data) {
        node n = new node(data);
        if (first == null) {
            first = n;
        } else {
            node temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
            n.next = null;
        }
    }

    void DELETE(int data) {
        if (first == null) {
            return;
        } else {
            node temp = first;
            while (temp != null) {
                if (temp.next.data.getSubid() == data) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }
        }
    }

    void display() {
        if (first == null) {
            return;
        } else {
            node temp = first;
            while (temp != null) {
                temp=temp.next;
            }
            System.out.println("*****************************************");
        }
    }
}