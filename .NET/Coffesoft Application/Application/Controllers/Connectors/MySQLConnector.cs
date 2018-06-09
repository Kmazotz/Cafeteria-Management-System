using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Data;
using System.Data.Common;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace DataServices.Connectors
{
    public class MySQLConnector : DBConnector
    {
        protected MySqlConnection connection;

        public MySQLConnector(string server, string dataBase, int port, string user, string password) : base(server, dataBase, port, user, password)
        {
            connection = new MySqlConnection(CreateConnection(("sslmode", "none")));
        }

        public override bool CloseConnection()
        {
            throw new NotImplementedException();
        }

        public override void DeleteQuery(string table)
        {
            throw new NotImplementedException();
        }

        public override T ExecuteFunction<T>(string func, params string[] parameters)
        {
            throw new NotImplementedException();
        }

        public override void ExecuteProcedure<T>(string proc, out T returns, params string[] parameters)
        {
            throw new NotImplementedException();
        }

        public override DataTable GetMapQuery(string table, string fields)
        {
            throw new NotImplementedException();
        }

        /*
public DataTable GetTableMap()
{
   connection.Open();
   DataTable table = new DataTable("inventory");
   MySqlCommand cmd = new MySqlCommand("select * from tbl_inventory", connection);
   cmd.ExecuteNonQuery();
   MySqlDataAdapter adapter = new MySqlDataAdapter(cmd);
   adapter.Fill(table);
   MySqlCommandBuilder builder = new MySqlCommandBuilder(adapter);
   return table;
}*/

        public override void InsertQuery(string table, string fields, string values)
        {
            throw new NotImplementedException();
        }

        public override bool OpenConnection()
        {
            try
            {
                connection.Open();
                MessageBox.Show("Connected!");

                return true;
            }
            catch (Exception)
            {
                return false;
            }

        }

        public override IEnumerable<string> SelectAllQuery(string table)
        {
            throw new NotImplementedException();
        }

        public override IEnumerable<string> SelectQuery(string table, string fields)
        {
            OpenConnection();
            List<string> list = new List<string>();
            using (MySqlCommand cmd = new MySqlCommand($"SELECT {fields} FROM {table};",connection))
            {

                MySqlDataReader reader = cmd.ExecuteReader();

                while (reader.Read())
                {
                    list.Add(reader.GetString("var"));
                }

            }
            return list;
        }

        public override void UpdateQuery(string table, string values)
        {
            throw new NotImplementedException();
        }

    }
}
